package lotto.analyze;

import java.text.NumberFormat;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Analyze {
	
	static int[] lotto = new int[45];
	static int[][] magicNum;
	
	public Analyze(HSSFWorkbook workbook, int start, int end) {
		magicNum = new int[(end - start) + 1][7];
		NumberFormat f = NumberFormat.getInstance();
		f.setGroupingUsed(false);	//지수로 안나오게 설정
		int temp = 0;
		//시트 갯수
		int sheetNum = workbook.getNumberOfSheets();
		for(int s = 0; s < sheetNum; s++) {
			HSSFSheet sheet = workbook.getSheetAt(s);
			//행 갯수
			// int rows = sheet.getPhysicalNumberOfRows();
			for(int r = start ; r <= end ; r++) {
				
				HSSFRow row = sheet.getRow(r);
				int cells = row.getPhysicalNumberOfCells();
				
				for(int c = 1 ; c < cells; c++) {
					HSSFCell cell = row.getCell(c);
					
					String value = "";
					if(cell!=null) {
						//타입 체크
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
					magicNum[temp][c - 1] = Integer.parseInt(value);
					lotto[Integer.parseInt(value) - 1]++;
				}
				temp++;
			}
		}
	}
	
	// 선택구간 데이터셋
	public void showDataset() {
		for(int i = 0; i < magicNum.length; i++) {
			for(int j = 0; j < magicNum[i].length; j++) {
				System.out.print(magicNum[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	// 번호별 당첨 통계
	public void everyNumber() {
		for(int i = 0; i < lotto.length; i++) {
			System.out.print((i + 1) + "\t : \t" + lotto[i] + "\t |");
			if((i + 1) % 5 == 0)
				System.out.println();
		}
	}
	
	public void everyPercentage() {
		double total = magicNum.length * magicNum[0].length;
		for(int i = 0; i < lotto.length; i++) {
			double percentage = lotto[i] / total * 100;
			System.out.printf("%d \t : \t %.3f %% \t |", (i + 1), percentage);
			if((i + 1) % 5 == 0)
				System.out.println();
		}
	}
	
	// 구간별 출현횟수 통계
	public void sectionNumber(int select) {
		int[] sectionArr;
		int temp = 0;
		switch(select) {
		case 1 : // 5 단위 구분
			sectionArr = new int[(45/5)];
			for(int i = 0; i < lotto.length; i++) {
				if(i % 5 == 0 && i != 0) {
					temp++;
					sectionArr[temp] += lotto[i];
				}else {
					sectionArr[temp] += lotto[i];
				}
			}
			for(int i = 0; i < sectionArr.length; i++) {
				System.out.println((5 * i) + 1 + " ~ " + ((i + 1) * 5) + "\t : \t" + sectionArr[i]);
			}
			System.out.println();
			break;
			
		case 2 : // 10 단위 구분
			sectionArr = new int[(45/10)+1];
			for(int i = 0; i < lotto.length; i++) {
				if(i % 10 == 0 && i != 0) {
					temp++;
					sectionArr[temp] += lotto[i];
				}else {
					sectionArr[temp] += lotto[i];
				}
			}
			for(int i = 0; i < sectionArr.length; i++) {
				System.out.println((10 * i) + 1 + " ~ " + ((i + 1) * 10) + "\t : \t" + sectionArr[i]);
			}
			System.out.println();
			break;
			
		default :
			System.out.println("잘못된 번호입니다.");
		}
	}

	// 미출현 번호
	public void unseenNumber() {
		System.out.print("미출현 번호 : ");
		for(int i = 0; i < lotto.length; i++) {
			if(lotto[i] == 0) {
				System.out.print((i + 1) + "\t");
			}
		}
		System.out.println();
	}
	
	// 홀짝 통계
	public void evenOdd() {
		int even = 0;
		int odd = 0;
		for(int i = 0; i < magicNum.length; i++) {
			for(int j = 0; j < magicNum[i].length; j++) {
				if(magicNum[i][j] % 2 == 0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		System.out.println("홀 : " + odd + " \t | 짝 : " + even);
	}
	
	// 연속 출현 번호
	public void straghtNumber() {
		int temp;
		System.out.print("연속 출현 번호 > ");
		for(int i = 0; i < magicNum.length; i++) {
			for(int j = 0; j < magicNum[i].length; j++) {
				temp = magicNum[i][j];
				for(int k = j; k < magicNum[i].length; k++) {
					if(temp + 1 == magicNum[i][k]) {
						System.out.print(temp + "-" + magicNum[i][k] + "\t");
					}else if(temp - 1 == magicNum[i][k]) {
						System.out.print(magicNum[i][k] + "-" + temp + "\t");
					}
				}
			}
		}
		System.out.println();
	}
}
