package ma.fstt.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeid;

    private String employename;
    private float employeSalary;

    public Employe() {
    }

    public Employe(Long employeid, String employename, float employeSalary) {
        this.employeid = employeid;
        this.employename = employename;
        this.employeSalary = employeSalary;
    }

    public Long getEmployeid() {
        return employeid;
    }

    public void setEmployeid(Long employeid) {
        this.employeid = employeid;
    }

    public String getEmployename() {
        return employename;
    }

    public void setEmployename(String employename) {
        this.employename = employename;
    }

    public float getEmployeSalary() {
        return employeSalary;
    }

    public void setEmployeSalary(float employeSalary) {
        this.employeSalary = employeSalary;
    }
}
