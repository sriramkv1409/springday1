import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar";
import GetEmployees from "./components/GetEmployees";
// import AddEmployee from "./components/AddEmployee";
import Login from "./components/Login";
import Signup from "./components/Signup";
import HomePage from "./components/HomePage";
import AddEmployees from "./components/AddEmployees";


const App = () => (
  <Router>
    <Routes>
      <Route path="/" element={<HomePage />} />
      <Route path="/add" element={<AddEmployees />} />
      <Route path="/getemployees" element={<GetEmployees/>}/>
      <Route path="/login" element={<Login />} />
      <Route path="/register" element={<Signup />} />
    </Routes>
  </Router>
);

export default App;