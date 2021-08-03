package GTraining.introduction.pkgimport.course;

import java.util.ArrayList;
import java.util.List;

public class TreeStructure {

    public static void main(String[] args) {
        Member root = new Member("Arjun", "Rokaya")
            .addChildren(
                new Member("Bipin", "Child 1")
                    .addChildren(
                            new Member("BCat", "Child 3")
                    )
            ).addChildren(
                    new Member("Bipul", "Child 2")
                        .addChildren(
                                new Member("BCow", "Child 4")
                        ).addChildren(
                                new Member("BCaff", "Child 5")
                    )
            );
    }

    public static class Member {
        private String firstName;
        private String lastName;
        private List<Member> children = new ArrayList<>();

        public Member(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Member addChildren(Member member) {
            children.add(member);
            return this;
        }

        @Override
        public String toString() {
            String rootStr = firstName + " - " + lastName;
            return  rootStr;
        }
    }

}
