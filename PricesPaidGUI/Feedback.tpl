<div id ="feedbackdialogbox" style="font-size:14px;">
                <div><h3>Feedback</h3></div>
        <p>
             <label for="feedback_name" class="feedback-label-len"><span style="font-weight:bold">(Optional) tell us who you are</span></label><br />
             <input type="text" id="feedback_name" maxlength="50" placeholder="Max of 50 characters" />
          </p>
          <p>
             <label for="feedback_message"  class="feedback-label-len"><span style="font-weight:bold">How can we do better?</span></label><br/>
             <textarea rows="8" cols="70" id="feedback_message" placeholder="Go ahead, type your feedback here, 500 characters only..." maxlength="500"></textarea>
             <br>
	     <span style="font-weight:bold">Number of characters to enter: </span><span id="feedbackNum_counter">500</span>
          </p>
                <fieldset>
                <legend><h4>Rating</h4>
             <div id="radio_button_list_title_wrapper">
               <div id="radio_button_list_title" class="feedback-label-len">
                  <span style="font-weight:bold">How likely are you to recommend Prices Paid to a colleague (1 means not likely, 5 means very likely)?</span>
               </div>
               <div>
                                                <input id="radio1" type="radio" name="rating" value="1" class="rating-radio"><label for="radio1">One</label>
                                                <input id="radio2" type="radio" name="rating" value="2" class="rating-radio"><label for="radio2">Two</label>
                                                <input id="radio3" type="radio" name="rating" value="3" class="rating-radio"><label for="radio3">Three</label>
                                                <input id="radio4" type="radio" name="rating" value="4" class="rating-radio"><label for="radio4">Four</label>
                                                <input id="radio5" type="radio" name="rating" value="5" class="rating-radio"><label for="radio5">Five</label>

               </div>
            </div>
          </fieldset>
          </p>
           <button id="feedback_submit" >Send</button>

</div>

