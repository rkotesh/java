import { useState, useEffect } from 'react';

function App() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/users")
      .then(response => response.json())
      .then(data => {
        setUsers(data);
      })
      .catch(error => {
        console.error("Error : ", error);
      });
  }, []);

  return (
    <div>
      <h2>Users List</h2>
        {users.map(user => (
          <div key={user.id}>
            {user.name} 
          ({user.email})</div>
        ))}
    </div>
  );
}

export default App;
