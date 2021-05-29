import logo from './logo.svg';
import './App.css';
import { Component, useEffect, useState } from 'react';
import React from 'react';

function SimpleForm(props) {
  const nameEl = React.useRef(null);

  const handleSubmit = e => {
    e.preventDefault();
    alert(nameEl.current.value);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>Name:
         <input type="text" ref={nameEl} />
      </label>
      <input type="submit" name="Submit" />
    </form>
  );
}


function App() {
  const [message, setMessage] = useState("");

  const productKey = React.useRef(null);

  // Submit handler 
  const handleSubmit = e => {
    e.preventDefault();
    


    // alert(productKey.current.value);
  };

  useEffect(() => {
    fetch('/api/hello')
      .then(response => response.text())
      .then(message => {
        setMessage(message);
      });
  }, [])
  return (
    <div className="App">
      <header className="App-header">
        <h2>Product Price Finder</h2>

        <h1 className="App-title">{message}</h1>
      </header>
      <section className="App-input-body">


        <form onSubmit={handleSubmit} className="App-form">
          <label className="App-form-label">Enter Product Keyword(s):
            <input className="App-form-input" type="text" name="productKey" ref={productKey} />
          </label>
          <input type="submit" name="Submit" className="App-form-submit"/>
        </form>

      </section>
      

      

    </div>

  )



}

export default App;
