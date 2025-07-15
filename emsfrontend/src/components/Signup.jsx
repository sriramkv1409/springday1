import { useState } from "react";
import axios from "axios";

const Signup = () => {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [userName, setUserName] = useState("");
    const [roleNames, setRoleNames] = useState([]);


    const handleRoleChange = (e) => {
        const { value, checked } = e.target;
        if (checked) {
            setRoleNames((prev) => [...prev, value]);
        } else {
            setRoleNames((prev) => prev.filter((role) => role !== value));
        }
    };


    const handleSignup = async (e) => {
        e.preventDefault(); //without this same data will be loaded agin and agin
        try {
            const response = await axios.post("https://emsbackend-zur3.onrender.com/api/auth/register", {
                name,
                email,
                password,
                userName,
                roleNames
            });
            console.log("Signup Success", response.data);
            alert("Signup Successful");
        } catch (error) {
            console.error("Signup Failed", error);
            alert("Signup Failed. Please try again.");
        }
    };

    return (
        <section>
            <h1>Signup</h1>
            <div>
                <form onSubmit={handleSignup}>
                    <label htmlFor="name">Employee Name</label>
                    <input
                        type="text"
                        id="name"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                    />
                    <br /><br />

                    <label htmlFor="email">Email</label>
                    <input
                        type="email"
                        id="email"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                    />
                    <br /><br />

                    <label htmlFor="userName">User Name</label>
                    <input
                        type="text"
                        id="userNam"
                        value={userName}
                        onChange={(e) => setUserName(e.target.value)}
                    />
                    <br /><br />

                    <label htmlFor="password">Password</label>
                    <input
                        type="password"
                        id="passwor"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                    />
                    <br /><br />

                    <fieldset>
                        <legend>Select Roles:</legend>
                        <label>
                            <input
                                type="checkbox"
                                value="ROLE_ADMIN"
                                onChange={handleRoleChange}
                            />
                            Admin
                        </label>
                        <br />
                        <label>
                            <input
                                type="checkbox"
                                value="ROLE_USER"
                                onChange={handleRoleChange}
                            />
                            User
                        </label>
                    </fieldset>

                    <br />

                    <button type="submit">Signup</button>
                </form>
            </div>
        </section>
    );
};

export default Signup;
