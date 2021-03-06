/*
 * Copyright 2019-2020 Shawn Peng
 * Email: shawnpeng@yeah.net
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.quantworld.app.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "proxy")
public class ProxyConfiguration extends Entitys implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  @Column(nullable = false, length = 50)
  private String protocol;

  @Column(nullable = false, length = 50)
  private String server;

  @Column(nullable = false)
  private int port;

  @Column(nullable = false)
  private boolean status;

  public ProxyConfiguration() {
    super();
  }

  @Id
  @GenericGenerator(name = "idGenerator", strategy = "uuid")
  @GeneratedValue(generator = "idGenerator")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String userId) {
    this.protocol = userId;
  }

  public String getServer() {
    return server;
  }

  public void setServer(String defaultModel) {
    this.server = defaultModel;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ProxyConfiguration{" +
        "protocol='" + protocol + '\'' +
        ", server='" + server + '\'' +
        ", port=" + port +
        ", status=" + status +
        '}';
  }
}
