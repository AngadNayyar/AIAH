/**
 * Copyright (c) 2012, Andy Janata
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 * provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this list of conditions
 *   and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice, this list of
 *   conditions and the following disclaimer in the documentation and/or other materials provided
 *   with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.socialgamer.cah.db;

import javax.persistence.*;

import net.socialgamer.cah.Constants;
import net.socialgamer.cah.data.WhiteCard;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.HashMap;
import java.util.Map;


/**
 * A white Card. Cards are persisted in a database and loaded with Hibernate.
 *
 * @author Andy Janata (ajanata@socialgamer.net)
 */
@Entity
@Table(name = "white_cards")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PyxWhiteCard extends WhiteCard {

  @Id
  @GeneratedValue
  private int id;

  private String text;

  private double deathHarm;
  private double random;
  private double sexual;
  private double political;
  private double human;
  private double religion;
  private double controversial;
  private double gross;
  private double scientific;
  private double racism;
  private double location;
  private double celebrity;

  private String watermark;

  public void setRandom(double random) {
    this.random = random;
  }

  public void setPolitical(double political) {
    this.political = political;
  }

  public void setHuman(double human) {
    this.human = human;
  }

  public void setReligion(double religion) {
    this.religion = religion;
  }

  public void setControversial(double controversial) {
    this.controversial = controversial;
  }

  public void setGross(double gross) {
    this.gross = gross;
  }

  public void setScientific(double scientific) {
    this.scientific = scientific;
  }

  public void setRacism(double racism) {
    this.racism = racism;
  }

  public void setLocation(double location) {
    this.location = location;
  }

  public void setCelebrity(double celebrity) {
    this.celebrity = celebrity;
  }

  public double getSexual() {
    return sexual;
  }

  public void setSexual(double sexual) {
    this.sexual = sexual;
  }

  public double getPolitical() {
    return political;
  }

  public double getHuman() {
    return human;
  }

  public double getReligion() {
    return religion;
  }

  public double getControversial() {
    return controversial;
  }

  public double getGross() {
    return gross;
  }

  public double getScientific() {
    return scientific;
  }

  public double getRacism() {
    return racism;
  }

  public double getLocation() {
    return location;
  }

  public double getCelebrity() {
    return celebrity;
  }


  public double getRandom() {
    return random;
  }


  /**
   * @return Client representation of this card.
   */
  @Override
  public final Map<Constants.WhiteCardData, Object> getClientData() {
    final Map<Constants.WhiteCardData, Object> cardData = new HashMap<Constants.WhiteCardData, Object>();
    cardData.put(Constants.WhiteCardData.ID, getId());
    cardData.put(Constants.WhiteCardData.TEXT, getText());
    cardData.put(Constants.WhiteCardData.WATERMARK, getWatermark());
    cardData.put(Constants.WhiteCardData.WRITE_IN, isWriteIn());
    cardData.put(Constants.WhiteCardData.DEATHHARM, getDeathHarm());
    return cardData;
  }

  @Override
  public int getId() {
    return id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  /**
   * @return Card text. HTML is allowed and entities are required.
   */
  @Override
  public String getText() {
    return text;
  }

  public void setText(final String text) {
    this.text = text;
  }

  @Override
  public String getWatermark() {
    return watermark == null ? "" : watermark;
  }

  public void setWatermark(final String watermark) {
    this.watermark = watermark;
  }

  @Override
  public boolean isWriteIn() {
    return false;
  }

 public double getDeathHarm() { return deathHarm; }

  public void setDeathHarm(final double deathHarm) {
    this.deathHarm = deathHarm;
  }

  @Override
  public String toString() {
    return String.format("%s %s (id:%d, watermark:%s, death: %f)", getClass().getName(), getText(), getId(),
            getWatermark(), getDeathHarm());
  }
}

