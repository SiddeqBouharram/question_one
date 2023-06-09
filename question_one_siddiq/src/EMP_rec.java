public class EMP_rec {
    // Data Field
    private String name;
    private String Position;
    private double Salary;
    private Integer Experience;
    private String Educational_level;

    // seter and getters for the data Fields
    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public Integer getExperience() {
        return Experience;
    }

    public void setExperience(Integer Experience) {
        this.Experience = Experience;
    }

    public String getEducational_level() {
        return Educational_level;
    }

    public void setEducational_level(String Educational_level) {
        this.Educational_level = Educational_level;
    }

    public double Calc_Salary() {
        double salary = getSalary() + (getSalary() * 0.05 * getExperience());
        if (getEducational_level().equals("Bachelor Degree")) {
            salary += 500;
        } else if (getEducational_level().equals("Diploma")) {
            salary += 250;
        }
        return salary;
    }

}
