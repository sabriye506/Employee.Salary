package horizoncolumbus.org;

public class Main {

    public static void main(String[] args) {
        Employee farah = new Employee();
//TRYING to print farah gave me this: horizoncolumbus.org.Employee@5f184fc6
        farah.setSalary(1000000);
        System.out.println(farah.getSalary());
        farah.setSalary(farah.farah * 1/10);
        System.out.println(farah.getSalary());
        // I dont know if this is exactly what you wanted but hey, it gets the job done.
    }
}
