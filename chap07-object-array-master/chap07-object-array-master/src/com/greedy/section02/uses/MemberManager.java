package com.greedy.section02.uses;

public class MemberManager {

	public void signUpMembers() {
		
		/* 5명의 회원 정보를 담을 객체 배열 생성 */
		MemberDTO[] members = new MemberDTO[5];
		
		/* 5명의 회원 정보를 각 인덱스에 할당 */
		members[0] = new MemberDTO(1, "user01", "pass01", "김영희", 20, '여');
		members[1] = new MemberDTO(2, "user02", "pass02", "홍길동", 22, '남');
		members[2] = new MemberDTO(3, "user03", "pass03", "박진희", 24, '여');
		members[3] = new MemberDTO(4, "user04", "pass04", "이순신", 26, '남');
		members[4] = new MemberDTO(5, "user05", "pass05", "선덕여왕", 28, '여');
	
		/* 회원 정보를 입출력할 용도의 MemberInsertManager 클래스 작성 */
		MemberInsertManager memberInsertManager = new MemberInsertManager();
		memberInsertManager.insert(members);
	
	}

	public void printAllMembers() {
		
		/* MemberSelectManager 클래스 작성
		 * 작성한 메소드를 호출하고 반환받은 값을 객체 배열 레퍼런스 변수에 저장한다.
		 * */
		
		/* -------------------------------------------------------------------------*/
//		MemberSelectManager msm = new MemberSelectManager();
//		MemberDTO[] selectedMembers = msm.selectAllMembers();
		/* -------------------------------------------------------------------------*/
		MemberDTO[] selectedMembers = new MemberSelectManager().selectAllMembers();
		
		System.out.println("===== 가입 된 회원 목록 =====");
		
		/* 향상된 for문 */
		for(MemberDTO member : selectedMembers) {
			System.out.println(member.getInformation());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
