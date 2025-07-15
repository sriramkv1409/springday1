import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Login from "./components/Login";
import Signup from "./components/Signup";

function App() {
  return (
    <Router>
      <nav style={styles.nav}>
        <ul style={styles.ul}>
          <li><Link to="/login" style={styles.link}>Login</Link></li>
          <li><Link to="/signup" style={styles.link}>Signup</Link></li>
        </ul>
      </nav>

      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="*" element={<Login />} /> {/* default route */}
      </Routes>
    </Router>
  );
}

const styles = {
  nav: {
    backgroundColor: "#333",
    padding: "10px"
  },
  ul: {
    display: "flex",
    listStyle: "none",
    gap: "20px",
    margin: 0,
    padding: 0
  },
  link: {
    color: "white",
    textDecoration: "none",
    fontSize: "18px"
  }
};

export default App;
