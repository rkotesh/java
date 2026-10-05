
import { useContext } from "react";
import { UserContext } from "../Context/UserContext";

function Navbar() {
    const { username, setUsername } = useContext(UserContext);

    return (
        <nav>
            <h2>My React App</h2>
            <p >Welcome, {username}</p>
        </nav>
    );
}

export default Navbar;