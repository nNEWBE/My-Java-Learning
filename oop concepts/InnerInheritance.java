public class InnerInheritance extends Inheritance {
    private String qualification;

    void displaInformations_2() {
        displaInformations();
        System.out.println("Qualification: " + getQualification());
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}