package Java_OOP.Sem_3;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private Stream stream;

    public List<StudentGroup3> getSortedStudentGroup3List() {
        List<StudentGroup3> studentGroup3List = new ArrayList<>(stream.getStudentGroup3List());
        studentGroup3List.sort(new StreamComparator());
        return studentGroup3List;
    }

}