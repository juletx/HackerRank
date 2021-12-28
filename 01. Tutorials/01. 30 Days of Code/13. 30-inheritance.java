

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate(){
        int sum = 0;
        int length = this.testScores.length;
        for(int i=0; i<this.testScores.length; i++){
            sum += this.testScores[i];
        }
        float avg = (float)sum/length;
        if (avg < 40){
            return 'T';
        }
        if (avg < 55){
            return 'D';
        }
        if (avg < 70){
            return 'P';
        }
        if (avg < 80){
            return 'A';
        }
        if (avg < 90){
            return 'E';
        }
        else{
            return 'O';
        }
    }
}

