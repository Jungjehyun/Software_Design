package Student;
//Student package
import Bulletin.Bulletin;
class Student{
	String stu_name;			//Student name
<<<<<<< HEAD
	String stu_number;			//Student_number

	public Student(String name, String num) {
		stu_name=name;
		stu_number=num;
	}
	
	public void see_cur_record() {			//search for student's current record
		
	}
	public boolean register_documnet() {	//서류 등록
		
	}
	public boolean apply_transfercredit() {	//학점 인정 신청 
		
	}
	public boolean cancel_apply() {			//신청 취소
		
	}
	public boolean see_appliable_record() {	//지원 가능한 공고 조회
		
	}
	public void see_dispatch_record() {		//파견 싱적 조회
		
	}
	public boolean apply_exchangestudent() {	//교환 학샹 지원 신청
		
	}
}

class Status{
	int step;					//신청 단계		
	int first_stat;			//1차 상태
	int final_stat;			//최종 상태
	int transfer_stat;		//학점 인정 신청 상태
	Bulletin application;		//지원 정보
	String course;				//강좌명
	public Status(int step,	int stat1, int stat2, int stat3, Bulletin application, String course) {
		this.step=step;
		first_stat=stat1;
		final_stat=stat2;
		transfer_stat=stat3;
		this.application=application;
		this.course=course;
	}
	
	public boolean see_course() {		//강좌 조회
		
	}	
	public boolean add_record() {		//실적 기록
		
	}
	public void show_info() {			//상태 정보 출력
		
	}
	public boolean first_application_check() {	//기간이 1차가 맞는 지 확인
		
	}	
	public boolean final_application_check() {	//기간이 1차가 맞는 지 확인
		
	}
	public boolean transfer_credit_application_check() {	//기간이 1차가 맞는 지 확인
	
	}
	public boolean first_modify() {			//학생의 1차 지원 상태 변경
		
	}
	public boolean second_modify() {			//학생의 최종 지원 상태 변경
		
	}
	public boolean final_modify() {			//학점 인정 신청 상태 변경
		
	}
	public boolean upload() {	//인스턴스를 DB에 저장
		
	}
	public Status download() {	//인스턴스를 DB에서 가져온다.
		
	}
	public void print(){		//현재 상태 출력
		System.out.println("Step: " + step);
		System.out.println("First Stat: " + first_stat);
		System.out.println("Second Stat: " + final_stat);
		System.out.println("Transfer Stat: " + transfer_stat);

	}
	
	
}
class Document{
	String stu_num;			//학생 학번
	String stu_name;		//학생 이름
	String col_name;		//신청 대학명
	String doc_type;		//서류 분류
	public Document(String stu_num, String stu_name, String col_name, String doc_type) {
		this.stu_num=stu_num;
		this.stu_name=stu_name;
		this.col_name=col_name;
		this.doc_type=doc_type;
	}
}

class Major_course{
	String course_name;		//강좌 이름
	boolean major;			//전공 여부
	char score;				//성적
	
	public Major_course(String name, boolean major, char score) {
		course_name=name;
		this.major=major;
		this.score=score;
		
	}
}
=======

	String stu_number;			//Student_number
  String stu_number;			//Student number


	public Student(String name, String num) {
		stu_name=name;
		stu_number=num;
	}
	

	public void see_cur_record() {			//�쁽�옱 �긽�깭 議고쉶
	

	public void see_cur_record() {			//search for student's current record
		

	}
	public boolean register_documnet() {	//�꽌瑜� �벑濡�
		
	}
	public boolean apply_transfercredit() {	//�븰�젏 �씤�젙 �떊泥� 
		
	}
	public boolean cancel_apply() {			//�떊泥� 痍⑥냼
		
	}
	public boolean see_appliable_record() {	//吏��썝 媛��뒫�븳 怨듦퀬 議고쉶
		
	}
	public void see_dispatch_record() {		//�뙆寃� �떛�쟻 議고쉶
		
	}
	public boolean apply_exchangestudent() {	//援먰솚 �븰�꺓 吏��썝 �떊泥�
		
	}
}

class Status{
	int step;					//�떊泥� �떒怨�		
	int first_stat;			//1李� �긽�깭
	int final_stat;			//理쒖쥌 �긽�깭
	int transfer_stat;		//�븰�젏 �씤�젙 �떊泥� �긽�깭
	Bulletin application;		//吏��썝 �젙蹂�
	String course;				//媛뺤쥖紐�
	public Status(int step,	int stat1, int stat2, int stat3, Bulletin application, String course) {
		this.step=step;
		first_stat=stat1;
		final_stat=stat2;
		transfer_stat=stat3;
		this.application=application;
		this.course=course;
	}
	
	public boolean see_course() {		//媛뺤쥖 議고쉶
		
	}	
	public boolean add_record() {		//�떎�쟻 湲곕줉
		
	}
	public void show_info() {			//�긽�깭 �젙蹂� 異쒕젰
		
	}
	public boolean first_application_check() {	//湲곌컙�씠 1李④�� 留욌뒗 吏� �솗�씤
		
	}	
	public boolean final_application_check() {	//湲곌컙�씠 1李④�� 留욌뒗 吏� �솗�씤
		
	}
	public boolean transfer_credit_application_check() {	//湲곌컙�씠 1李④�� 留욌뒗 吏� �솗�씤
	
	}
	public boolean first_modify() {			//�븰�깮�쓽 1李� 吏��썝 �긽�깭 蹂�寃�
		
	}
	public boolean second_modify() {			//�븰�깮�쓽 理쒖쥌 吏��썝 �긽�깭 蹂�寃�
		
	}
	public boolean final_modify() {			//�븰�젏 �씤�젙 �떊泥� �긽�깭 蹂�寃�
		
	}
	public boolean upload() {	//�씤�뒪�꽩�뒪瑜� DB�뿉 ����옣
		
	}
	public Status download() {	//�씤�뒪�꽩�뒪瑜� DB�뿉�꽌 媛��졇�삩�떎.
		
	}
	public void print(){		//�쁽�옱 �긽�깭 異쒕젰
		System.out.println("Step: " + step);
		System.out.println("First Stat: " + first_stat);
		System.out.println("Second Stat: " + final_stat);
		System.out.println("Transfer Stat: " + transfer_stat);

	}
	
	
}
class Document{
	String stu_num;			//�븰�깮 �븰踰�
	String stu_name;		//�븰�깮 �씠由�
	String col_name;		//�떊泥� ����븰紐�
	String doc_type;		//�꽌瑜� 遺꾨쪟
	public Document(String stu_num, String stu_name, String col_name, String doc_type) {
		this.stu_num=stu_num;
		this.stu_name=stu_name;
		this.col_name=col_name;
		this.doc_type=doc_type;
	}
}

class Major_course{
	String course_name;		//媛뺤쥖 �씠由�
	boolean major;			//�쟾怨� �뿬遺�
	char score;				//�꽦�쟻
	
	public Major_course(String name, boolean major, char score) {
		course_name=name;
		this.major=major;
		this.score=score;
		
	}
}
>>>>>>> b025b949b772ab0885affff81cc2757e40669304
