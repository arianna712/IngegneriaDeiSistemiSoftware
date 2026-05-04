%====================================================================================
% fireflysync_sonar description   
%====================================================================================
dispatch( cellstatus, cellstatus(X,Y,COLOR) ). %update cell status on grid
event( sonarinput, range(V) ). %emitted by sonar
event( dosync, dosync(PERIOD) ). %shared frequency from orchestrator
event( cancelsync, cancelsync(MSG) ). %cancel sync and return to random
%====================================================================================
context(ctxfireflysync, "localhost",  "TCP", "8040").
context(ctxgrid, "127.0.0.1",  "TCP", "8050").
 qactor( griddisplay, ctxgrid, "external").
  qactor( sonar, ctxfireflysync, "it.unibo.sonar.Sonar").
 static(sonar).
  qactor( orchestrator, ctxfireflysync, "it.unibo.orchestrator.Orchestrator").
 static(orchestrator).
  qactor( firefly, ctxfireflysync, "it.unibo.firefly.Firefly").
dynamic(firefly). %%Oct2023 
