// Sample Input

// Heraldo Memelli 8135627
// 2
// 100 80
// Sample Output

//  Name: Memelli, Heraldo
//  ID: 8135627
//  Grade: O

class Student extends Person{
	private int[] testScores;  
  
    /*	
    *   Class Constructor
    *   
    *   Parameters: 
    *   firstName - A string denoting the Person's first name.
    *   lastName - A string denoting the Person's last name.
    *   id - An integer denoting the Person's ID number.
    *   scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName,lastName,id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
        this.testScores = scores;
    }
    /*	
    *   Method Name: Calculate
    *   Return: A character denoting the grade.
    */
    public char calculate(){
        float average = 0;
        for(int i=0; i<testScores.length; i++){
            average += testScores[i];
        }
        average = average / testScores.length; 
        
        if(average >= 90 && average <= 100){
            return 'O';
        }
        else if(average >= 80 && average < 90){
            return 'E';
        }
        else if(average >= 70 && average < 80){
            return 'A';
        }
        else if(average >= 55 && average < 70){
            return 'P';
        }
        else if(average >= 40 && average < 55){
            return 'D';
        }
        else if(average < 40){
            return 'T';
        }
        return 'F';
    }
}
