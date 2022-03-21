package lotto.main;

import java.text.NumberFormat;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Dataset {
	public Dataset(HSSFWorkbook workbook) {
		NumberFormat f = NumberFormat.getInstance();
		f.setGroupingUsed(false);	//지수로 안나오게 설정
		
		int sheetNum = workbook.getNumberOfSheets();
		
		for(int s = 0; s < sheetNum; s++) {
			HSSFSheet sheet = workbook.getSheetAt(s);
			int rows = sheet.getPhysicalNumberOfRows();
			
			for(int r = 0 ; r < rows ; r++) {
				HSSFRow row = sheet.getRow(r);
				int cells = row.getPhysicalNumberOfCells();
				
				for(int c = 0 ; c < cells; c++) {
					HSSFCell cell = row.getCell(c);
					
					String value = "";
					if(cell!=null) {
						switch(cell.getCellType()) {
						case STRING:
							value = cell.getStringCellValue();
							break;
						case NUMERIC:
							value = f.format(cell.getNumericCellValue())+"";
							break;
						case BLANK:
							value = cell.getBooleanCellValue()+"";
							break;
						case ERROR:
							value = cell.getErrorCellValue()+"";
							break;
						default :
							value = "null";
							break;
						}
					}
					System.out.print(value + "\t");
				}
				System.out.println();
			}
		}
	}
}
