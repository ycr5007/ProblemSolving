package lotto.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import lotto.analyze.Analyze;

/*

	회차구분 조회 ( row , cell 값 입력받아 지정 )

*/

public class Main {
	static final String PATH = "D:\\@Private\\Study\\@SOLDESK\\@Code\\javasource\\SelfQuestion_LottoAnalyze\\dataAPI\\";	//파일 경로 설정
	static final String FILENAME = "test.xls";	//파일명 설정
	
	public static HSSFWorkbook readExcel(String path,String filename) {
		HSSFWorkbook workbook = null;
		try {
		FileInputStream file = new FileInputStream(path+filename);
		workbook = new HSSFWorkbook(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return workbook;
	}
	
	public static void showMenu() {
		System.out.println("========================================================================================");
		System.out.println("1 . 전체 데이터 셋");
		System.out.println("2 . 현재 데이터 셋");
		System.out.println("3 . 번호별 당첨확률");
		System.out.println("4 . 구간별 출현횟수");
		System.out.println("5 . 기간별 미출현 번호");
		System.out.println("6 . 홀짝 통계");
		System.out.println("7 . 연속번호 출현");
		System.out.println("8 . 조회기간 변경");
		System.out.println("0 . 종료");
		System.out.println("========================================================================================");
	}
	
	public static void main(String[] args) {
		HSSFWorkbook workbook = readExcel(PATH, FILENAME);
		Scanner sc = new Scanner(System.in);
		boolean systemFlag = true;
		while(systemFlag) {
			boolean flag = true;
			System.out.println("조회 시작점을 입력해주세요. (1 ~ 1001)");
			int startNum = sc.nextInt();
			System.out.println("조회 끝점을 입력해주세요. (" + (startNum + 1) + " ~ 1001)");
			int endNum = sc.nextInt();
			if(startNum > endNum) {
				System.out.println("잘못 입력하셨습니다. 시작숫자가 끝 숫자보다 작게 입력해주세요.");
				flag = false;
			}
			Analyze analyze = new Analyze(workbook, startNum, endNum);
			while(flag) {
				System.out.println("시작 : " + startNum + " 회차 \t | 끝 : " + endNum + " 회차");
				showMenu();
				switch(sc.nextInt()) {
					case 1 :
						new Dataset(workbook);
						break;
					case 2 :
						analyze.showDataset();
						break;
					case 3 :
						System.out.println("1 . 수치 통계");
						System.out.println("2 . 확률 통계");
						switch(sc.nextInt()) {
							case 1:
								analyze.everyNumber();
								break;
							case 2:
								analyze.everyPercentage();
								break;
							default:
								System.out.println("잘못된 입력입니다. 메뉴로 돌아갑니다.");
						}
						break;
					case 4 :
						System.out.println("1 . 5 단위 구분");
						System.out.println("2 . 10 단위 구분");
						analyze.sectionNumber(sc.nextInt());
						break;
					case 5 :
						analyze.unseenNumber();
						break;
					case 6 :
						analyze.evenOdd();
						break;
					case 7 :
						analyze.straghtNumber();
						break;
					case 8 :
						System.out.println("조회기간을 변경합니다...");
						flag = false;
						break;
					case 0 :
						System.out.println("프로그램을 종료합니다...");
						flag = false;
						systemFlag = false;
						break;
					default :
						System.out.println("잘못된 값을 입력하셨습니다.");
						break;
				}
			}
		}
		sc.close();
	}
}
