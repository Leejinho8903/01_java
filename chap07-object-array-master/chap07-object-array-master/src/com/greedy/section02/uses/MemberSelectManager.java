package com.greedy.section02.uses;

public class MemberSelectManager {

	public MemberDTO[] selectAllMembers() {
				
		return new MemberDTO[] {
				new MemberDTO(1, "user01", "pass01", "김영희", 20, '여')
				, new MemberDTO(2, "user02", "pass02", "홍길동", 22, '남')
				, new MemberDTO(3, "user03", "pass03", "박진희", 24, '여')
				, new MemberDTO(4, "user04", "pass04", "이순신", 26, '남')
				, new MemberDTO(5, "user05", "pass05", "신사임당", 28, '여')
		};
	}

}
