package lab3;

class Study {
    private String course;
    Study (String course) {
        this.course = course;
    }


    public String printCourse() {
        return this.course;
    }

}

class JavaProgram {
    public static void main(String[] args) {

        Study java = new Study("Изучение Java - это просто!");
        System.out.println(java.printCourse());;
    }

}
