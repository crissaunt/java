public class Jpe02_solayao{
	public static void main(String[] args){
	String firstName, lastName, gender;
	char middleName;
	int age;
	long phone_no;
	String skill_compe ,careerObj,email;

	firstName = "Florence Cris";
	middleName = 'L';
	lastName = "Solayao";
	age = 2;
	gender = "Male";
	skill_compe = "Communication and Problem Solving";
	careerObj = "Chef";
	email = "akoto@gmail.com";
	phone_no = 6399999999999L;


	 /* System.out.format("\t\tResume\n
	First Name: %d\t\t\t Middle Name: %d \t\t\t Last Name: %d\n
	Age: %d \t\t\t\t\t Gender: %d\n\n
	
	Skills or Competencies: %d \t\t\t Career Objective or Summary: %d \n\n

	Contact me here: \n\tEmail:%d \t\t\t Phone Number: %d
	",firstname,middleName, lastName, age, gender,
	 skill_compe, careerObj,email,phone_no
	); */

	System.out.format("\n\t\t\t\t Resume\n\nFirst Name: %s \t Middle Name: %s \t Last Name: %s\nAge: %d\t\t\t\t Gender:%s\n\nSkills or Competencies: %s\n\nCareer Objective or Summary: %s \n\nContact me here: \n\t\tEmail:%s \n\t\tPhone Number: %d", firstName,middleName, lastName, age , gender, skill_compe, careerObj, email, phone_no);

	

	}
}