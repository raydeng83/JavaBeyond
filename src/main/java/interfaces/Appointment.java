package interfaces;


import java.time.LocalDate;

public class Appointment implements Comparable<Appointment>{

    private int id;
    private String name;
    private LocalDate appointmentDate = LocalDate.now();
    private int priority;
    private boolean completed;

    public Appointment() {}

    public Appointment(int id, String name, int priority) {
        this(id, name, LocalDate.now(), priority, false);
    }

    public Appointment(int id, String name, LocalDate appointmentDate, int priority, boolean completed) {
        this.id = id;
        this.name = name;
        this.appointmentDate = appointmentDate;
        this.priority = priority;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public int compareTo(Appointment appointment) {
        return name.compareTo(appointment.name);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", priority=" + priority +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appointment)) return false;

        Appointment that = (Appointment) o;

        if (id != that.id) return false;
        if (priority != that.priority) return false;
        if (completed != that.completed) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return appointmentDate != null ? appointmentDate.equals(that.appointmentDate) : that.appointmentDate == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (appointmentDate != null ? appointmentDate.hashCode() : 0);
        result = 31 * result + priority;
        result = 31 * result + (completed ? 1 : 0);
        return result;
    }
}
