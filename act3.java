package studentinfo;

public class act3 {
    
    public static void main(String []args){
        
    StudentInfo cachero = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019");
    cachero.setIdNumber("18-2867-995");
    cachero.setFirstName("Vily Kaylle");
    cachero.setLastName("Cachero");
    cachero.setCourse("Batchelors of Science in Computer Science");
    cachero.setMajor("Digital Arts and Animation");
    cachero.print();
    
    
    StudentInfo cabiara = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019");
    cabiara.setIdNumber("18-6728-998");
    cabiara.setFirstName("Cecilia Agatha");
    cabiara.setLastName("Cabiara");
    cabiara.setCourse("Batchelors of Science in Computer Science");
    cabiara.setMajor("Digital Arts and Animation");
    cabiara.print();
    
    
    StudentInfo belarmino = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019");
    belarmino.setIdNumber("18-7265-865");
    belarmino.setFirstName("Zhyra Beatrix");
    belarmino.setLastName("Belarmino");
    belarmino.setCourse("Batchelors of Science in Computer Science");
    belarmino.setMajor("Digital Arts and Animation");
    belarmino.print();
   }
}
