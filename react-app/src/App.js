import React, { useState } from 'react';
import './App.css';
import GNavBar from "./GNavBar";
import LoginPage from "./components/LoginPage";
import {Badge, Button} from "reactstrap";
import ModalDemo from "./components/ModalDemo";

function App() {
  const [dialogViewCount, setDialogViewCount] = useState(0);
  return (
      <div className="App">
        <GNavBar />
        <div>
          <Button color="warning" outline>
            Notifications <Badge color="warning">4</Badge>
          </Button>
        </div>
        <ModalDemo buttonLabel="Open Dialog" dialogViewCount={dialogViewCount} setDialogViewCount={setDialogViewCount}/>
        <ModalDemo dialogViewCount={dialogViewCount}  setDialogViewCount={setDialogViewCount}/>
        <LoginPage />
      </div>
  );
}

export default App
