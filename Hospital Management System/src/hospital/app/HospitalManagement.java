package hospital.app;
import hospital.model.Appointment;
import hospital.model.Doctor;
import hospital.model.Patient;

import java.util.Scanner;
import java.util.ArrayList;

public class HospitalManagement {

    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Hospital Management System ");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPatient(sc);
                    break;
                case 2:
                    addDoctor(sc);
                    break;
                case 3:
                    scheduleAppointment(sc);
                    break;
                case 4:
                    viewPatients(sc);
                    break;
                case 5:
                    viewDoctors(sc);
                    break;
                case 6:
                    viewAppointments(sc);
                    break;
                case 0:
                    System.out.println("Exiting......");
                    break;
                default:
                    System.out.println("Invalid choice. please try again. ");
                    break;
            }
        }
        while (choice != 0);
        
        sc.close();
    }
    private static void addPatient(Scanner sc){
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Patient genger: ");
        String gender = sc.nextLine();
        System.out.print("Enter Patient age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Address: ");
        String address = sc.nextLine();


        Patient patient = new Patient(name, gender, age, address);
        patients.add(patient);
        
        System.out.println("Patient Added Successfully");
        
    }

    private static void addDoctor(Scanner sc){
        System.out.print("Enter doctor name: ");
        String name = sc.nextLine();
        System.out.print("Enter Doctor Speciality: ");
        String speciality = sc.nextLine();

        Doctor doctor = new Doctor(name, speciality);
        doctors.add(doctor);

        System.out.println("Doctor Added Successfully");
    }
    private static void scheduleAppointment(Scanner sc){
        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorId = sc.nextInt();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = sc.next();

        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient != null && doctor != null) {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        } else {
            System.out.println("Invalid Patient ID or Doctor ID.");
        }
    }
    private static void viewPatients(Scanner sc){

    }
    private static void viewDoctors(Scanner sc){

    }
    private static void viewAppointments(Scanner sc){

    }

    private static Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }
    private static Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }
}
