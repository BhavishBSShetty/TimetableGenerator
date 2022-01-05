import "./App.css";
import Login from "./login.js";
import Timetable from "./timetable.js";
import Even from "./even.js";
import Section from "./section.js";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <Switch>
          <Route exact path="/">
            <Login />
          </Route>
          <Route path="/timetable">
            <Timetable />
          </Route>
          <Route path="/even">
            <Even />
          </Route>
          <Route path="/section">
            <Section />
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

export default App;
