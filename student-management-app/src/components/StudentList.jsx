import StudentCard from "./StudentCard";

function StudentList({ students, deleteStudent }) {
    return (
        <div>
            {students.length === 0 ? (
                <p>No students found.</p>
            ) : (
                students.map((student) => (
                    <StudentCard
                        key={student.id}
                        student={student}
                        deleteStudent={deleteStudent}
                    />
                ))
            )}
        </div>
    );
}

export default StudentList;