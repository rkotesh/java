
import Counter from "./components/Counter";
import Dashboard from "./components/Dashboard";
import Navbar from "./components/Navbar";
import { UserProvider } from "./Context/UserProvider";
import Profile from "./components/Profile";
function App() {
    return (
        <UserProvider>
            <div>
                <Navbar />
                <hr />

                <h1>React Hooks</h1>

                <Counter />
                <Dashboard />
                <Profile />
            </div>
        </UserProvider>
    );
}

export default App;