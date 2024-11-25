package Repository;

import Model.Member;

import java.util.HashMap;

public class MemberRepository {
    private  HashMap<String, Member> members = new HashMap<>();

    public void addMember(Member member) {
        members.put(member.getMemberID(), member);
    }

    public Member getMemberById(String memberID) {
        return members.get(memberID);
    }

    public void removeMember(String memberID) {
        members.remove(memberID);
    }

    public  HashMap<String, Member> getMembers() {
        return members;
    }
}
