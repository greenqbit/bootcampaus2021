import React from 'react';
//React v17 -> no need to import
import './App.css';
import logo from './logo.svg'
import GNavBar from "./GNavBar";
import LoginPage from "./components/LoginPage";
import {Badge, Button} from "reactstrap";
import ModalDemo from "./components/ModalDemo";

function App2() {
    return (
        <div className="App">
            {/*<header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <p>
                    Our first Bootcamp React App :)
                </p>
                <a className="App-link"
                href="https://greenqbit.com"
                target="_blank"
                rel="noopener noreferrer"
                >
                  Learn React via GreenQbit
                </a>
            </header>*/}
            <GNavBar />
            <div>
                <Button color="warning" outline>
                    Notifications <Badge color="warning">4</Badge>
                </Button>
            </div>
            <ModalDemo buttonLabel="Open Dialog"  />
            <ModalDemo   />
            <LoginPage />
        </div>
    );
}

export default App2
