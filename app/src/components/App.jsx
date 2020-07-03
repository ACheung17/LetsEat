import React from 'react';
import {Router as BrowserRouter, Route, Router } from "react-router-dom";
import Home from "./Home";

function App() {
  return (
    <div>
      {/* <Router>
        <Route path="/" exact component={Home} />
      </Router> */}

      <Home />
    </div>
  );
}

export default App;
