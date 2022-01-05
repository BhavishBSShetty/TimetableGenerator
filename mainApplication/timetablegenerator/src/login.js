import React from "react";
import "./login.css";
import book from "././images/book.png";
import bubble from "././images/bubble.png";
import lbubble from "././images/leftbubble.png";
import lbubble1 from "././images/leftbubble1.png";
import fish1 from "././images/fish1.png";
import fish3 from "././images/fish2.png";
import fish4 from "././images/fish3.png";
import fish2 from "././images/fish4.png";
import { Link } from "react-router-dom";

function login() {
  return (
    <div>
      <div id="bigBox">
        <div id="box"></div>
        <div id="box2"></div>
      </div>

      <div id="bigBox1">
        <div id="box3"></div>
        <div id="box4"></div>
        <div id="box5"></div>
      </div>

      <div id="bigBox2">
        <div id="box6"></div>
        <div id="box7"></div>
      </div>

      <div id="bigBox3">
        <div id="box8"></div>
        <div id="box9"></div>
        <div id="box10"></div>
        <div id="box11"></div>
      </div>
      <div class="bg_circles">
        <div class="circle-1"></div>
        <div class="circle-2"></div>
        <div class="circle-3"></div>
        <div class="circle-4"></div>
      </div>
      <div class="overlay"></div>

      <div class="main">
        <section class="home_section align-item-center active" id="home">
          <div class="container">
            <div class="row align-item-center">
              <div class="home_text">
                <h1>Login</h1>
                <h2 class="gradient-text">Name</h2>
                <input type="text" name="name" class="login_txt" />
                <h2 class="gradient-text">Password</h2>
                <input type="password" name="passwrd" class="login_txt" />
                <br />
                <Link to="/timetable">
                  <p class="btn link_item">Login</p>
                </Link>
              </div>
              <div class="home_img">
                <div class="img_box">
                  <img src={book} alt="profile_img" class="book" />
                </div>
                <div className="small_comp">
                  <img src={bubble} alt="profile_img" class="bubble1" />
                  <img src={lbubble} alt="profile_img" class="bubble2" />
                  <img src={lbubble1} alt="profile_img" class="bubble3" />
                  <img src={fish1} alt="profile_img" class="fish1" />
                  <img src={fish2} alt="profile_img" class="fish2" />
                  <img src={fish3} alt="profile_img" class="fish3" />
                  <img src={fish4} alt="profile_img" class="fish4" />
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>
    </div>
  );
}

export default login;
