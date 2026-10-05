
import { useState } from "react";
import { UserContext } from "./UserContext";

export function UserProvider({ children }) {
    const [username, setUsername] = useState("Ram");

    return (
        <UserContext.Provider value={{ username, setUsername }}>
            {children}
        </UserContext.Provider>
    );
}