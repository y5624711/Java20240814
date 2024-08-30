package ch08.lecture.Sol.Sol7;

public class MySqlDao implements  DataAccessObject{


    @Override
    public void select() {
        System.out.println("MySql에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySql에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySql에서 업데이트");
    }

    @Override
    public void delete() {
        System.out.println("MySql에서 삭제");
    }
}
