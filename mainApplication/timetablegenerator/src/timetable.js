import React from "react";
import "./timetable.css";
import sempage from "././images/sempage.png";
import topbubble from "././images/topbubble.png";
import topcloud from "././images/topcloud.png";
import topcloud1 from "././images/topcloud1.png";
import bottombubble from "././images/bottombubble.png";
import centercloud from "././images/centercloud.png";

import { Link } from "react-router-dom";

function timetable() {
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
                <h1 class="heading">Which semester?</h1>

                <Link to="/even">
                  <p class="btn link_item">Even</p>
                </Link>
                <Link to="/odd">
                  <p class="btn link_item">Odd</p>
                </Link>
              </div>
              <div class="home_img">
                <div class="img_box">
                  <img src={sempage} alt="profile_img" class="sempage" />
                </div>
                <div className="small_comp">
                  <img src={topbubble} alt="profile_img" class="topbubble" />
                  <img src={topcloud} alt="profile_img" class="topcloud" />
                  <img src={topcloud1} alt="profile_img" class="topcloud1" />
                  <img
                    src={bottombubble}
                    alt="profile_img"
                    class="bottombubble"
                  />

                  <img
                    src={centercloud}
                    alt="profile_img"
                    class="centercloud"
                  />
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>
    </div>
  );
}

export default timetable;
