function StudentCard({ student, deleteStudent }) {
    return (
        <div className="student-card">
            <h3>{student.name}</h3>
            <p>Email: {student.email}</p>
            <p>Course: {student.course}</p>

            <button onClick={() => deleteStudent(student.id)}>
                Delete
            </button>
        </div>
    );
}

export default StudentCard;