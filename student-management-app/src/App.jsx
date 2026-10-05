import { useState } from "react";
import StudentForm from "./components/StudentForm";
import StudentList from "./components/StudentList";
import "./App.css";

function App() {
    const [student, setStudent] = useState({
        name: "",
        email: "",
        course: ""
    });

    const [students, setStudents] = useState([]);

    const [search, setSearch] = useState("");

    const addStudent = () => {
        const newStudent = {
            id: Date.now(),
            ...student
        };

        setStudents([...students, newStudent]);

        setStudent({
            name: "",
            email: "",
            course: ""
        });
    };

    const deleteStudent = (id) => {
        setStudents(
            students.filter((student) => student.id !== id)
        );
    };

    const filteredStudents = students.filter((student) =>
        student.name.toLowerCase().includes(search.toLowerCase())
    );

    return (
        <div className="app">
            <h1>Student Management</h1>

            <StudentForm
                student={student}
                setStudent={setStudent}
                addStudent={addStudent}
            />

            <input
                type="text"
                placeholder="Search student..."
                value={search}
                onChange={(e) => setSearch(e.target.value)}
            />

            <h2>Students: {filteredStudents.length}</h2>

            <StudentList
                students={filteredStudents}
                deleteStudent={deleteStudent}
            />
        </div>
    );
}

export default App;