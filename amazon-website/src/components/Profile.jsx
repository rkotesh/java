import { useContext } from "react";
import { UserContext } from "../Context/UserContext";

function Profile() {
    const { username, setUsername } = useContext(UserContext);

    return (
        <div>
            <h2>Profile</h2>

            <p>Username: {username}</p>

            <input
                type="text"
                value={username}
                onChange={(e) => setUsername(e.target.value)}
                placeholder="Enter username"
            />
        </div>
    );
}

export default Profile;