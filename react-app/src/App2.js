import React from 'react';
//React v17 -> no need to import
import './App.css';
import logo from './logo.svg'

function App2() {
    return (
        <div className="App">
            <header className="App-header">
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
            </header>
        </div>
    );
}

export default App2
