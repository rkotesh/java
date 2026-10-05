function StudentForm({ student, setStudent, addStudent }) {
    const handleChange = (e) => {
        setStudent({
            ...student, // 
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();

        if (!student.name || !student.email || !student.course) {
            alert("Please fill all fields");
            return;
        }

        addStudent();
    };

    return (
        <form onSubmit={handleSubmit}>
            <input
                type="text"
                name="name"
                placeholder="Enter name"
                value={student.name}
                onChange={handleChange}
            />

            <input
                type="email"
                name="email"
                placeholder="Enter email"
                value={student.email}
                onChange={handleChange}
            />

            <select
                name="course"
                value={student.course}
                onChange={handleChange}
            >
                <option value="">Select Course</option>
                <option value="AI & ML">AI & ML</option>
                <option value="CSE">CSE</option>
                <option value="ECE">ECE</option>
            </select>

            <button type="submit">Add Student</button>
        </form>
    );
}

export default StudentForm;