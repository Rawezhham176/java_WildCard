public class People {
    private String name;
    private int age;
    private boolean hasJob;
    private GENDER gender;


    public People(String name, int age, boolean hasJob, GENDER gender){
        this.name = name;
        this.age = age;
        this.hasJob = hasJob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasJob=" + hasJob +
                ", GENDER='" + gender + '\'' +
                '}';
    }
}
