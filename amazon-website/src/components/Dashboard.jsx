
import { useContext } from "react";
import { UserContext } from "../Context/UserContext";

function Dashboard() {
    const { username } = useContext(UserContext);

    return (
        <div>
            <h2>Dashboard</h2>
            <p>Hello {username}, Welcome to the Dashboard!</p>
        </div>
    );
}

export default Dashboard;