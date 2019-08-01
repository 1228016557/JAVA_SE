package DAY07_test;
/*
2.程序员类Coder
		属性：
			姓名name
			工号id
			工资salary
		行为：
			工作work()
 */
public class Coder {
    private String name;
    private int id;
    private int salary;
    public void work(){

    }
    public  Coder(){}
    public  Coder(String name,int id,int salary){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
