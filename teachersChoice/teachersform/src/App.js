import logo from "./logo.svg";
import "./App.css";
import Login from "./login.js";
import SignUp from "./signup.js";
import FormPage from "./formpage.js";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <Switch>
          <Route exact path="/">
            <Login />
          </Route>
          <Route path="/signup">
            <SignUp />
          </Route>
          <Route path="/form">
            <FormPage />
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

export default App;
