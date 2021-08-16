import React, { useState } from 'react';
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';

//IMP : 1 -> props => property passed to the component
const ModalDemo = (props) => {

    const { buttonLabel = 'Click', className } = props; //default value -> click

    //const [modal, setModal] = useState(false);
    /*let modal = false
    const setModal = (m) => { //setter ( getter /setter?)
        modal = m
    }*/
    const [modal, setModal] = useState(false) //hoook, javascript getter /setter

    //IMP: function call / value update
    // const toggle = () => setModal(!modal);

    const toggle = () => {
        setModal(!modal) //!false => true
    }

    const apply = () => {
        //Do something
        //Save data to database
        //API Cal...
        toggle()
    }

    return (<>
        <div>

            <Button color="danger" onClick={toggle}>{buttonLabel}</Button>
            {/* one way <Button color="danger" onClick={toggle}>{buttonLabel == undefined ? 'Click' : buttonLabel}</Button> */}
            <Modal isOpen={modal} toggle={toggle} className={className}>
                <ModalHeader toggle={toggle}>Bootcamp Eran, Suman, Sam</ModalHeader>
                <ModalBody>
                    <b>BootCamp Australia, 2021 in covid time. </b>
                </ModalBody>
                <ModalFooter>
                    <Button color="primary" onClick={apply}>Do Something</Button>{' '}
                    <Button color="secondary" onClick={toggle}>Cancel</Button>
                </ModalFooter>
            </Modal>


        </div>
        </>
    );
}

export default ModalDemo;