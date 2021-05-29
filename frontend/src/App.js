import './App.css';
import { Component, useEffect, useState } from 'react';
import React from 'react';
import PostForm from './PostForm'

function App() {
  const [message, setMessage] = useState("");

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
        
        {/* msg tester */}
        <p className="App-title">{message}</p>

      </header>
      <section className="App-input-body">
        <PostForm />
      </section>
    </div>
  )
}

export default App;
