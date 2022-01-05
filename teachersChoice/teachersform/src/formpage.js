import React from "react";
import "./formpage.css";
import book from "././images/formRight.png";
import geo1 from "././images/geo1.png";
import geo2 from "././images/geo2.png";
import geo3 from "././images/geo3.png";

function formpage() {
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
                <h1>Personal Choice</h1>
                <h2 class="gradient-text">Name</h2>
                <input type="text" name="name" class="login_txt" />
                <h2 class="gradient-text">Email</h2>
                <input type="email" name="email" class="login_txt" />
                <h2 class="gradient-text">Class</h2>
                <input type="text" name="class" class="login_txt" />
                <h2 class="gradient-text">Subject</h2>
                <input type="text" name="sub" class="login_txt" />
                <br />
                <a href="#about" class="btn link_item">
                  Submit
                </a>
              </div>
              <div class="home_img">
                <div class="img_box">
                  <img src={book} alt="profile_img" class="book" />
                  <div className="geometry">
                    <img src={geo1} alt="profile_img" class="book1" />
                    <img src={geo2} alt="profile_img" class="book2" />
                    <img src={geo3} alt="profile_img" class="book3" />
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>
    </div>
  );
}

export default formpage;
