package javaExF;

public class VariousFriends {
    public static void main(String[] args) {
        // 객체 생성
        Artist kim = new Artist("뮤지션 김씨");
        Architect lee = new Architect("건축가 이씨");
        Developer park = new Developer("개발자 박씨");
        Lawyer choi = new Lawyer("변호사 최씨");

        // 그룹화: 인터페이스 기준
        Friend[] friends = {kim, lee, park, choi};
        for (Friend f : friends) {
            f.dearFriend();
        }
    }
}

/* 1. 해당 인터페이스를 완성하시오. */
interface Friend {
    void dearFriend();
}

/* 2. 아래 모든 클래스를 완성하시오. */
class Artist implements Friend {
    String name;

    public Artist(String name) {
        this.name = name;
    }

    @Override
    // 오버라이딩의 접근제어자는 부모보다 작거나 같다.
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", this.name);
    }
}

class Architect implements Friend {
    String name;

    public Architect(String name) {
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", this.name);
    }
}

class Developer implements Friend {
    String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", this.name);
    }
}

class Lawyer implements Friend {
    String name;

    public Lawyer(String name) {
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", this.name);
    }
}