import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/Home.css'; // Optional: for styling

const Home = () => {
  const navigate = useNavigate();

  const goToLogin = () => {
    navigate('/login');
  };

  const goToSignup = () => {
    navigate('/signup');
  };

  return (
    <div className="home-container">
      <nav className="navbar">
        <h2 className="logo">Employee Management System</h2>
        <div className="nav-buttons">
          <button className="nav-btn" onClick={goToLogin}>Login</button>
          <button className="nav-btn" onClick={goToSignup}>Signup</button>
        </div>
      </nav>

      <main className="main-content">
        <h1>Welcome to the Employee Management System</h1>
        <p>Manage employees efficiently with our secure and easy-to-use platform.</p>
      </main>
    </div>
  );
};

export default Home;
