package _DUAL.primerdesafio.variables;

public class Developer {
    private final static String COMPANY = "Everis";
    private final static byte MAX_VACATIONS = 21;
    private static int employeesNum = 0;

    private int employeeId;
    private byte holidaysDays;
    private String name;
    private Speciality speciality;

    public Developer(String name) {
        setName(name);
        setSpeciality(speciality);
        setEmployeeId();
        setHolidaysDays(MAX_VACATIONS);
    }

    public Developer(String name, Speciality speciality) {
        setName(name);
        setSpeciality(speciality);
        setEmployeeId();
        setHolidaysDays(MAX_VACATIONS);
    }

    //Empresa
    public static String getCOMPANY() {
        return COMPANY;
    }

    //MaxVacaciones
    public static byte getMaxVacations() {
        return MAX_VACATIONS;
    }

    //numEmpleados
    public static int getEmployeesNum() {
        return employeesNum;
    }

    public static void setEmployeesNum(byte employeesNum) {
        Developer.employeesNum = employeesNum;
    }

    //idEmpleado
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId() {
        employeesNum++;
        if (employeesNum<=127){
            this.employeeId = employeesNum;
        }else{
            System.out.println("\nNo es posible dar de alta al empleado, por lo que se le dara 0 como id.");
        }
    }

    //diasVacaciones
    public byte getHolidaysDays() {
        return holidaysDays;
    }

    public void setHolidaysDays(byte holidaysDays) {
        this.holidaysDays = holidaysDays;
    }

    //nombre
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Especialidad
    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        String resul;
        if (speciality == null) {
            resul="Developer{" +
                    "employeeId=" + employeeId +
                    ", holidaysDays=" + holidaysDays +
                    ", name='" + name +
                    '}';
        }else{
            resul="Developer{" +
                    "employeeId=" + employeeId +
                    ", holidaysDays=" + holidaysDays +
                    ", name='" + name + '\'' +
                    ", speciality=" + speciality +
                    '}';
        }
        return resul;
    }

    public void decreaseHolidays(int num){
        byte totalDays = (byte)(getHolidaysDays()-num);
        if (totalDays>0){
            setHolidaysDays(totalDays);
        }else{
            setHolidaysDays((byte) 0);//Si los dias de vacaciones son negativos se establecen 0 dias de vacaciones
        }
    }

    public void changeSpeciality(Speciality newSpeciality){
        System.out.println(this.name+"ha cambiado su especialidad de "+speciality+" a "+newSpeciality);
        setSpeciality(newSpeciality);
    }

    public void giveSpeciality(Speciality newSpeciality){
        System.out.println(this.name+" se ha especializado en "+newSpeciality);
        setSpeciality(newSpeciality);
    }
}
