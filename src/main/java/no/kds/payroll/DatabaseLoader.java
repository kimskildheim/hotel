package no.kds.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Kim", "Skildheim", "clown"));
        this.repository.save(new Employee("Jo", "Mehmet", "printer expert"));
        this.repository.save(new Employee("Thomas", "Holen", "web-smurf"));
        this.repository.save(new Employee("Morten", "Kjelling", "Northener"));
        this.repository.save(new Employee("PK", "Hellan", "pk-nes"));
        this.repository.save(new Employee("Anders", "Brustad", "The one"));
        this.repository.save(new Employee("Marius", "Gunners", "The frontend ninja"));
        this.repository.save(new Employee("Henning", "Lundheim", "A am you father"));
        this.repository.save(new Employee("Steinar", "Sveen", "The ski jumper"));
    }
}